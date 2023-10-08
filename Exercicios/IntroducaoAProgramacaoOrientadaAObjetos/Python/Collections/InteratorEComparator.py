# Criando uma lista
numeros = [1, 2, 3]
print("Lista: ", numeros)

# Criando um Iterador
it = iter(numeros)

numero = next(it)
print("Elemento: ", numero)

# Imprimindo os elementos restantes
for value in it:
    print(value, end=", ")
