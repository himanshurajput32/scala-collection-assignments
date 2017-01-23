object StackList extends App{ 

def pop(list:List[Int]):List[Int]={
val element=list.last
println(s"Deleted element is $element")
val new_list=for(i<- 0 to list.length-2) yield list(i)
new_list.toList
}

def push(n:Int,list:List[Int]):List[Int]={
val new_list=list :+ n
new_list
}
val stackList=List(1,2,3,4,5)
 println(push(10,stackList))
 println(pop(stackList))
}
