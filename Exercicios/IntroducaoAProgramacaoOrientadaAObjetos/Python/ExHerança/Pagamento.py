from abc import ABC, abstractmethod

# Definição da interface Pagamento
class Pagamento(ABC):
    # Método para calcular o pagamento mensal
    @abstractmethod
    def calcular_pagamento_mensal(self):
        pass
