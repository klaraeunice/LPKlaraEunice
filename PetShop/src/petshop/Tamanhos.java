package petshop;

enum TamanhoAnimal {
    PEQUENO (50.0,12.0,30.0),
     MEDIO(60.0,18.0,40.0),
     GRANDE(70.0,25.0,50.0);

    final double baseBanho;
    final double valorHoraHotel;
    final double valorTosa;

    TamanhoAnimal(double baseBanho, double valorHoraHotel, double valorTosa) {
         this.baseBanho = baseBanho;
         this.valorHoraHotel = valorHoraHotel;
         this.valorTosa = valorTosa;
     }

     enum TamanhoPelo{
         CURTO(0.0), MEDIO(15.0), LONGO(25.0);

         final double adicional;


         TamanhoPelo(double adicional) {
             this.adicional = adicional;
         }
     }
 }
