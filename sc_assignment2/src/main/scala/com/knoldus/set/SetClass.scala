package com.knoldus.set

class SetClass {

  private var set = Set.empty[Int]

  // Add element into set,  return the size
  def addElement(element: Int): Int = {
    set += element
    set.size
  }

  // add the elements of the list to the set,  return the size
  def addElement(elem: List[Int]): Int = {
    set ++= elem
    set.size
  }

  // get all the subsets of the set(db), make sure to check the types.
  def getSubSetList: List[List[Int]] = {
    val subsets = set.subsets()
    val subsetList = subsets.map(_.toList).toList
    subsetList
  }

  // verify it the given list is a subset of the db set.
  def verifyIfSubSet(list: List[Int]): Boolean ={
      list.toSet.subsetOf(set)
  }

  // verify if the element is present in the set.
  def checkIfExists(elem: Int): Boolean = {
    set.contains(elem)
  }

  // remove if the element is present in the set, return the size
  def removeElement(elem: Int): Int = {
    if(set.contains(elem)){
      set -= elem
      set.size
    }
    else
      set.size
  }

  // return all the odd elements from the set
  def getOddElement: Set[Int] = {
    set.filter(_ % 2 != 0)
  }

}
