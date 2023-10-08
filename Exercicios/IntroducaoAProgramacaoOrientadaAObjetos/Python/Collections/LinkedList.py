from collections import deque

# Cria uma deque vazia chamada 'animais'.
animais = deque()

# Adiciona elementos no final da deque.
animais.append("Cachorro")
animais.append("Cavalo")
animais.append("Vaca")

print("Deque: ", animais) 

# Adiciona o elemento "Gato" na pasição 1 da deque.
animais.insert(1, "Gato")
print("Deque: ", animais)
