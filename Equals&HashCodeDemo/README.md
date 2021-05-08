## Output of HashMapDemo.java

           ...sh
Case 1 :
Output if we are not override hashcode and equals method in Employee Class  :

{10=pawan}
{Employee{id=2, name='vinita'}=pawan}

Case 2 :

Output if we are overrided hashcode and equals method in Employee Class :

{10=pawan}
{Employee{id=2, name='vinita'}=pawan, Employee{id=2, name='vinita'}=Vinita}
           ...
 
 
 - Reason if we are adding our custom class object as key in hash based collection then it's necessarry to override equal and hash code method. becuase if we are not overriden then it will use objet class hash code method which return hashcode on the basis of reference and that is different so that's why our buisness logic not functioning properly.


