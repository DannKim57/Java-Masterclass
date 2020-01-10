* What is Abstraction?

Abstract Class or Interface
“the process of removing physical, spatial, or temporal details or attributes in the study of objects or systems to focus attention on details of greater importance; it is similar in nature to the process of generalization.”

“[For example, ] Let's say our game needs to have some sort of random thing that annoys the game player when they eat dinner. This could be a HouseFly or a Telemarketer or both -- but how do you allow for both with a single function? And how do you ask each different type of object to "do their annoying thing" in the same way?”
 
* References:

https://stackoverflow.com/questions/383947/what-does-it-mean-to-program-to-an-interface/384067
https://javarevisited.blogspot.com/2012/04/10-points-on-interface-in-java-with.html
https://javarevisited.blogspot.com/2010/10/abstraction-in-java.html
https://www.wikiwand.com/en/Abstraction_(computer_science)



* There are 1 interface and 6 classes: Ipest interface, Main class, DiningRoom class, Person class, Telemarketer class, Insect class, and HouseFly class. 
- Telemarketer class extends Person class. 
- HouseFly class extends Insect class. 
- Both Telemarketer class and HouseFly class implement Ipest interface.
= The purpose of this program is to figure out how an interface put together those classes which have nothing in common and, eventually, what the main role of an interface is. (Note that the same goes for 'List<String> list = new ArrayList<String>();')
