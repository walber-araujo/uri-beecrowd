import Text.Printf (printf)

main :: IO ()
main = do
  entrada <- getLine
  let num1 = read entrada :: Double

  entrada <- getLine 
  let num2 = read entrada :: Double

  let media = (num1*3.5 + num2*7.5) / 11 :: Double 

  printf "MEDIA = %.5f\n" media
