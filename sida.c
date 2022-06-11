#include <stdio.h>
#include <stdlib.h>
#include <sys/ipc.h>
#include <sys/shm.h>
#include <sys/stat.h>
#include <unistd.h>
#include <sys/wait.h>

int main (int argc, char *argv[])
{
    int segmento, *p, id, pid, status;
    
    // aloca a memória compartilhada shmget( key, size, flags)
    segmento = shmget (IPC_PRIVATE, sizeof (int), IPC_CREAT | IPC_EXCL | S_IRUSR | S_IWUSR);
    
    // ligação/associação da memória compartilhada ao processo
    //shmat (segmento, 0, 0) -> id, ptr = 0 (sistema escolhe o endereço), flags = 0 (write and read)
    p = (int *) shmat (segmento, 0, 0);
    *p = 2000;
    
    if ((id = fork()) < 0)
    {
        printf ("Erro na criação do novo processo");
        exit (-2);
    }
    else if (id == 0)
    {
        *p += 2;
        printf ("Processo A = %d\n", *p);
    }
    else
    {
        pid = wait (&status);
        *p += 20;
        printf ("Processo B = %d\n", *p);
    }
    
    // libera a memória compartilhada do processo
    shmdt (p);
    
    // libera a memória compartilhada
    shmctl (segmento, IPC_RMID, 0);
    
    return 0;
} 