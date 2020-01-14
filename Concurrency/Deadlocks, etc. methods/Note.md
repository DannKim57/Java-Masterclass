class Message{ message, empty + read() + write()}
synchronized read() in class Message { while(empty) + try, wait(), catch + notifyAll() + return message }
synchronized write() in class Message { while(!empty) + try, wait(), catch + this.message = message + notifyAll() }

& Why not use an if statement instead of a loop?
- "The answer is that we always want to call wait() within a for loop that's testing for watever condition 
  we are wating on.
  because when a thread is notified to wake up there's no guarantee that it's being woken up 
  because the condition is waiting on has changed so it's possible the operating system has woken it up. 
  For another reason it could have woken up because wait through and iterrupted exception so we always want to call
  within a loop so that when it returns because there's been a notification of some sort we'll go back to the
  beginning of the loop we check whatever condition we're interested in 
  and then we call wait() again if the condition hasn't changed so in other words, never assume that a thread has been
  woken up becuase the condition that it's waiting on has changed." 
  
& Why are we calling notifyAll() rather than notify()?
- "Because we can't notify a specific thread and that's because the notified thread doesn't accept any parameters. 
  It's conventional to use notifyAll unless we're dealing with a situation when there are a number of threads that all perform 
  a similar task waiting for a lock so in that case we don't want to wake up every thread because when there's a lot of them
  that could result in a huge performance here so call notify so that only one thread is woken up since all the threads are 
  waiting to do a similar task whichever thread is woken up should be able to proceed so now that we've implemented or made changes
  to our doce to duse wait() and notifyAll()." 
