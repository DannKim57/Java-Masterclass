& Thread Pool
- ExecutorService executorService = Executors.newFixedThreadPool(num)
  + executorService.execute(instance), executorService.execute(instance) 
  + executorService.shutdown()

& What is Thread Pool in Java?
- Since active threads consume system resources, 
  a JVM creating too many threads at the same time can cause the system to run out of memory. 
  This necessitates the need to limit the number of threads being created.
- A thread pool reuses previously created threads to execute current tasks 
  and offers a solution to the problem of thread cycle overhead and resource thrashing.
- Reference : https://www.geeksforgeeks.org/thread-pools-java/
