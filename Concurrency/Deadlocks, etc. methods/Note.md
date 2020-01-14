class Message{ message, empty + read() + write()}
- synchronized read() in class Message { while(empty) + try, wait(), catch + notifyAll() + return message }
- synchronized write() in class Message { while(!empty) + try, wait(), catch + this.message = message + notifyAll() }
- notifyAll() before return in read() and notifyAll() after this.message = message in write().

& Why not use an if statement instead of a loop?
- Because you need to keep checking on the condition. 
- There is no guarantee that it's being woken up because the condition it is waiting on has changed. 
  
& Why are we calling notifyAll() rather than notify()?
- It is conventional to use notyfyAll() unless a number of threads perform a similar task.
- In other words, you should use notify() when a number of threads do the same task. 
  Or else, you should use notifyAll() when threads perform different jobs. 
  
& Difference between nofity and interrupt in Java
- "Unlike notify, interruption targets a specific thread and interruption does not require that the interrupted thread be waiting on a monitor."
- "Interruption is used only for cancellation while notify helps the waiting thread to attain its goal and help it continue its execution."
- Reference: https://www.javapedia.net/Java-Multithreading/1426
