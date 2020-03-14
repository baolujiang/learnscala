def sq(n: Double) = n * n
sq(10)

def cb(n: Double): Double = {
  var result = sq(n) * n
  result
}

cb(3)