
def myList=['Mango', 'Oranges', 'Grapes', 'Apple', 'Watermelon', 'Pineapple']
println "Sorting Alphabetically " 
println myList.sort()
println "Sorting string of list by its length in increasing order"
println myList.sort { it.size() }
println "Sorting string of list by its length in increasing order"
println myList.sort { -it.size() }