import Text.Printf (printf)

main :: IO()
main = do
  let pi = 3.14159 :: Double
  
  entrada <- getLine 
  let raio = read entrada :: Double

  let area = (raio^2) * pi
  printf "A=%.4f\n" area
  
