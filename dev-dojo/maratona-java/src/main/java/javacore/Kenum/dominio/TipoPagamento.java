package javacore.Kenum.dominio;

public enum TipoPagamento {
        DEBITO {
            @Override
            public double calcularDesoconto(double valor) {
                return valor * 0.1;
            }
        }, CREDITO {
        @Override
        public double calcularDesoconto(double valor) {
            return valor * 0.05;
        }
    };

    public double calcularDesoconto(double valor){
            return 0;
    }

    }