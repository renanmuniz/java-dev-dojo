package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest01 {

    /*Quando usar cada um?
    String para mapear objetos ou textos simples como mensagens ao usuario, dados ao BD, etc.
    StringBuilder e StringBuffer quando lidar com manipulação de textos grandes.
     */

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100_000); //1675ms
        long fim = System.currentTimeMillis();
        System.out.println("Tempo string: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringWithStringBuilder(1_000_000); //19ms
        fim = System.currentTimeMillis();
        System.out.println("Tempo stringbuilder: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringWithStringBuffer(1_000_000); //25ms
        fim = System.currentTimeMillis();
        System.out.println("Tempo stringbuffer: " + (fim - inicio) + "ms");
    }

    private static void concatString(int tamanho) {
        String texto = "";
        for(int i=0;i<tamanho;i++) {
            texto+=i;
        }
    }

    private static void concatStringWithStringBuilder(int tamanho) {
        StringBuilder stringBuilder = new StringBuilder(tamanho);
        for(int i=0;i<tamanho;i++) {
            stringBuilder.append(i);
        }
    }

    private static void concatStringWithStringBuffer(int tamanho) {
        StringBuffer stringBuffer = new StringBuffer(tamanho);
        for(int i=0;i<tamanho;i++) {
            stringBuffer.append(i);
        }
    }
}
