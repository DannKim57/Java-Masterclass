& Usage 
- bufferLock.lock() + try, actions + finally, bufferLock.unlock

& Possible error or exception
- If we don't use lock as in a recommended way, the code is error-prone such as Maximum Lock Count Exceeded. 
  Although we use unlock() properly, it would seem quite messy. Check 274. Reentrant Lock. 
- Illegal Monitor Exception. This exception would happen if unlock() is duplicated. 


& Difference between synchronized vs ReentrantLock
- "ReentrantLock is mutual exclusive lock, similar to implicit locking provided by synchronized keyword in Java, 
  with extended feature like fairness, which can be used to provide lock to longest waiting thread."
- References: https://javarevisited.blogspot.com/2013/03/reentrantlock-example-in-java-synchronized-difference-vs-lock.html
