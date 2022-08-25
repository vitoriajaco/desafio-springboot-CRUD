package com.desafiogerenciadorcontas.gerenciadorDeContas.Enum;

public enum Status {
    AGUARDANDO(1),
    PAGO(2),
    VENCIDA(3);

    private int codigoStatus;

    private Status (int codigoStatus){
        this.codigoStatus = codigoStatus;
    }

    public int getCodigoStatus() {
        return codigoStatus;
    }

    public static Status valueOf(int codigoStatus) throws IllegalAccessException {
        for (Status value : Status.values()){
            if (codigoStatus == value.getCodigoStatus()){
                return value;
            }
        }

        throw new IllegalAccessException("Código de status invalido!");
    }


}
