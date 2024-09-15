package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA("PF", "Pessoa Física"),
    PESSOA_JURIDICA("PJ", "Pessoa Jurídica");

    private final String valor;
    private final String descritivo;

    TipoCliente(String valor, String descritivo) {
        this.valor = valor;
        this.descritivo = descritivo;
    }

    public static TipoCliente tipoClientePorDescritivo(String descritivo) {
        for(TipoCliente tipo : values()) {
            if(tipo.getDescritivo() == descritivo) {
                return  tipo;
            }
        }
        return null;
    }

    public String getValor() {
        return valor;
    }

    public String getDescritivo() {
        return descritivo;
    }
}
