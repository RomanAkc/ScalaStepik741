case class Dog(name: String, breed: String, ownerName: String)

val bobik = Dog("Bobik", "corgie", "Oleg")

val tuzik1 = bobik.copy("Tuzik")

//val tuzik2 = bobik(name="Tuzik")

val tuzik3 = bobik.copy(name="Tuzik")

val tuzik4 = Dog("Tuzik", "corgie", "Oleg")