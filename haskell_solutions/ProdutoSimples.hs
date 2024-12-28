main :: IO ()
main = do
  entrada <- getLine
  let num1 = read entrada :: Int

  entrada <- getLine
  let num2 = read entrada :: Int

  putStrLn $ "PROD = " ++ show (num1 * num2)
