import Text.Printf (printf)

media2 :: Float -> Float -> Float -> Float
media2 a b c = (a*2 + b*3 + c*5) / 10

main :: IO ()
main = do
  a <- readLn :: IO Float
  b <- readLn :: IO Float
  c <- readLn :: IO Float

  printf "MEDIA = %.1f\n" (media2 a b c)
