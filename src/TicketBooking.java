public class TicketBooking {
    private String movieTitle,seatNumber,snackCombo;
    private float price;
    private TicketBooking(TicketBookingBuilder builder){
        this.movieTitle=builder.movieTitle;
        this.seatNumber=builder.movieTitle;
        this.snackCombo=builder.snackCombo;
        this.price=builder.price;
    }
    public static class TicketBookingBuilder{
        private String movieTitle,seatNumber,snackCombo;
        private float price;
        public TicketBookingBuilder(){
        }
        public TicketBookingBuilder setMovieTitle(String movieTitle){
            this.movieTitle=movieTitle;
            return this;
        }
        public TicketBookingBuilder setSeatNumber(String seatNumber){
            this.seatNumber=seatNumber;
            return this;
        }
        public TicketBookingBuilder setSnackCombo(String snackCombo){
         this.snackCombo=snackCombo;
         return this;
        }
        public TicketBookingBuilder setPrice(float price){
            this.price=price;
            return this;
        }
        public TicketBooking build(){
            return new TicketBooking(this);
        }
    }
}
