public class Exercise8By9 {
    public static void main(String[] args) throws Exception
    {
        throw new UnsupportedFuctionException("지원하지 않는 기능입니다.",100);
    }

    public static class UnsupportedFuctionException extends RuntimeException{
        final private int ERR_CODE ;

        public UnsupportedFuctionException(String message, int errorCode) {
            super(message);
            ERR_CODE = errorCode;
        }

        UnsupportedFuctionException(String msg){
            this(msg, 100);
        }

        public int getErrorCode() {
            return ERR_CODE;
        }

        public String getMessage() {
            return "[" + getErrorCode() + "]" + super.getMessage();
        }
    }
}
