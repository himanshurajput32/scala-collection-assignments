

object ListImplementation extends App{

//Method to print table of elements in table
def printTable(list:List[Int]):Unit={
for(i<-1 to 10){	
for(ls<-list){
print(ls*i+" ")
}
println("")
}
}

//Method to aggregate two lists
def listAggregate(list_one:List[Int],list_two:List[Int])={
val res=list_one zip list_two
println(res.map(temp=>List(temp._1,temp._2)))

}

//Method to find sum of lists

def listSum(list:List[Int]):Int={
val res=list.fold(0)((a,b)=>a+b)
res
}

//method to find multiplication in list
def listMul(list:List[Int]):Int={
val mul=list.fold(1)((a,b)=>a*b)
mul
}

//method to find last element of list and its index 
def lastElement(list:List[Int]):Unit={
var pos=0
var element=list(0)
for(ls<-list){
element=ls
pos +=1
}
}
printTable(List(2,3,4,5))
println(listSum(List(1,2,3,4)))
println(listMul(List(1,2,3,4)))
listAggregate(List(1,2,3),List("a","b","c"))
}



