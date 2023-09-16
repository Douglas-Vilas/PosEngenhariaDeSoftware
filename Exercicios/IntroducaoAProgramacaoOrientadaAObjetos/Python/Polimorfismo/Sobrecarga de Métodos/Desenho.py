class Desenho:

    # Método sem parâmetro
    def mostrar(self, simb='*', n=10):
        print(" ")
        for i in range(n):
            if i != n - 1:
                print(simb + ", ", end="")
            else:
                print("*" + ";")
        print(" ")

    # Método com um parâmetro
    def mostrar_com_simb(self, simb):
        print(" ")
        for i in range(10):
            if i != 9:
                print(simb + ", ", end="")
            else:
                print(simb + ";")
        print(" ")

    # Método com dois parâmetros
    def mostrar_com_simb_e_n(self, simb, n):
        print(" ")
        for i in range(n):
            if i != n - 1:
                print(simb + ", ", end="")
            else:
                print(simb + ".")
        print(" ")