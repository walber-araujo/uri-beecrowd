import Text.Printf (printf)

salario :: Int -> Float -> Float
salario horas valorPorHora = fromIntegral horas * valorPorHora

main :: IO ()
main = do
  a <- readLn :: IO Int
  b <- readLn :: IO Int
  c <- readLn :: IO Float

  printf "NUMBER = %d\n" a
  printf "SALARY = U$ %.2f\n" (salario b c)
