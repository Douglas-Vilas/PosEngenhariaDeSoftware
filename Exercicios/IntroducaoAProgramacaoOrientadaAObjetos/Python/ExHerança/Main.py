from gerente import Gerente
from desenvolvedor import Desenvolvedor
from vendedor import Vendedor

# Classe Main que contém o método Main para execusão do programa
gerente = Gerente("Maincon", 10000.0)
desenvolvedor = Desenvolvedor("Douglas", 8000.0, Desenvolvedor.NivelExperiencia.AVANCADO)
vendedor = Vendedor("Fábio", 3500.00, 5000.0)

print(f"Pagamento mensal do Gerente: R${gerente.calcular_pagamento_mensal():.2f}")
print(f"Pagamento mensal do Desenvolvedor: R${desenvolvedor.calcular_pagamento_mensal():.2f}")
print(f"Pagamento mensal do Vendedor: R${vendedor.calcular_pagamento_mensal():.2f}")

