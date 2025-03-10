class WordCount(s: String):
   def countWords: Map[String, Int] =
      println(s)
      val l = s
         .toLowerCase()
         .replaceAll(" ", "|")
         .replaceAll(",", "|")
         .replaceAll(":", "")
         .replaceAll("\\.", "")
         .replaceAll("\t", "")
         .replaceAll("\n", "")
         .split('|')
         .toList
         .filterNot(_ == "")
      println(l)
      l.map(w => w -> l.count(_ == w)).toMap
