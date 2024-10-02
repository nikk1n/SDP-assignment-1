public interface Movie {
    String getTitle();
    void setTitle(String title);
    String getType();
}
    class RegularMovie implements Movie{
        private String title;

        public RegularMovie(String title) {
            this.title=title;
        }

        @Override
        public String getTitle() {
            return title;
        }

        @Override
        public String getType() {
            return "regular";
        }

        @Override
        public void setTitle(String title) {
            this.title = title;
        }

    }
    class IMAXMovie implements Movie{
        private String title;

        public IMAXMovie(String title) {
        }

        @Override
        public String getTitle() {
            return title;
        }

        @Override
        public String getType() {
            return "imax";
        }

        @Override
        public void setTitle(String title) {
            this.title = title;
        }

    }