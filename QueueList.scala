object QueueList extends App{


def dequeue(list:List[Int]):List[Int]={
val element=list.head
println(s"Deleted element = $element")
val list_updated=list.tail
list_updated
}


def enqueue(n:Int,list:List[Int]):List[Int]={
val new_list=list :+ n
new_list
}

val list=List(1,2,3,4,5)
println(dequeue(list))

println(enqueue(6,list))
} 
