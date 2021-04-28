public class Test {
    public static final String[] VALID_ACCOUNT = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] INVALID_ACCOUNT = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String args[]) {
        AccountExample accountExample = new AccountExample();
        for (String account : VALID_ACCOUNT) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }

        for (String account : INVALID_ACCOUNT) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
    }
}
