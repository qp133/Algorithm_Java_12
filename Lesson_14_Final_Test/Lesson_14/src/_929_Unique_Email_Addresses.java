import java.util.HashSet;

public class _929_Unique_Email_Addresses {
    public static int numUniqueEmails(String[] emails) {
        HashSet<String> hashSet = new HashSet<>();
        for (String email : emails) {
            int index = email.indexOf("@");

            //Localname: chuỗi từ vị trí 0 đến index
            String localName = email.substring(0,index);

            //domainName: chuỗi từ index đến hết độ dài chuỗi
            String domainName = email.substring(index);

            if (localName.contains("+")) {
                localName = localName.substring(0,localName.indexOf("+"));
            }
            localName = localName.replaceAll("\\.", "");
            hashSet.add(localName + domainName);
        }
        return hashSet.size();
    }

    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"};

        System.out.println(numUniqueEmails(emails));
    }
}
