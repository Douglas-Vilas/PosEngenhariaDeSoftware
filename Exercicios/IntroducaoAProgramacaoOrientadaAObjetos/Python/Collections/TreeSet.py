# Cria um set vazio chamado 'numeros'.
numeros = set()

# Adiciona elementos ao set. 
numeros.add(8)
numeros.add(6)
numeros.add(9)
print("Set: ", numeros)

# Remove o elemento 6 do set.
result = 6 in numeros # Verifica se o número 6 está no set.
if result:
    numeros.remove(6)
    print("Removeu? ", result)
    print("Set: ", numeros)

# Remove todos os elementos do Set.
result = bool(numeros) # Verifica se o set não está vazio. 
numeros.clear() # Remove todos os elementos.
print("Removeu todos? ", result)
print("Set: ", numeros)
