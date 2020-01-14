& Index Out of Bounds Exception
- Thread Interference. 
- To solve this problem, there are two options: synchronized(buffer), and lock interface. 
- Only one of the threads have to get a chance to remove an attritube in the buffer. 

& ArrayList doesn't support synchronization
- "This class is roughly equivalent to Vector, except that it is unsynchronized."
- Reference: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

