package scalabasic

/**
 * @author purnendu
 */
object NodeFinder extends App {

  tst3()

  def tst3() {
    val fifth = Node(value = 5)
    val fourth = Node(Some(fifth), 4)
    val third = Node(Some(fourth), 3)
    val second = Node(Some(third), 2)
    val first = Node(Some(second), 1)

    assert(kthNode(first, 0).get.value == 5)
    assert(kthNode(first, 1).get.value == 4)
    assert(kthNode(first, 2).get.value == 3)
    assert(kthNode(first, 3).get.value == 2)
    assert(kthNode(first, 4).get.value == 1)
    assert(kthNode(first, 5).isEmpty)
    assert(kthNode(first, 6).isEmpty)

  }

  def kthNode(head: Node, k: Int): Option[Node] = {

      def find(counter: Node = head, cur: Node = head, pos: Int = -k): Option[Node] = {

        
        if (cur.next.isEmpty) {
          if (pos >= 0) Some(counter)
          else None
        } else {
          if (pos >= 0) find(counter.next.get, cur.next.get, pos + 1)
          else find(counter, cur.next.get, pos + 1)
        }
      }

    find()
  }
}

case class Node(next: Option[Node] = None, value: Int)