package com.desafiogerenciadorcontas.gerenciadorDeContas.Enum;

public enum Tipo {
    LUZ(1),
    AGUA(2),
    COMIDA(3),
    LAZER(4),
    OUTROS(5);

    private int codigoTipo;
    private Tipo (int codigoTipo){
        this.codigoTipo = codigoTipo;
    }

    public int getCodigoTipo() {
        return codigoTipo;
    }

    public static Tipo valueOf(int codigoTipo) throws IllegalAccessException {
        for (Tipo values : Tipo.values()){
            if (codigoTipo == values.getCodigoTipo()){
                return values;
            }
        }

        throw new IllegalAccessException("Código de tipo invalido!");
    }
}
