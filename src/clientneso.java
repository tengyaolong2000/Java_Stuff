import java.util.ArrayList;

class client{
    private int id;
    private String name;
    private String phone;
    private ArrayList<Account> accounts;

    public client(int id, String name, String phone){
        this.id = id;
        this.name = name;
        this.phone = phone;

        accounts = new ArrayList<>();
    }

    public boolean addAccount(Account account1){
        accounts.add(account1);
        return true;
    }

    public boolean removeAccount(int accountId){
        for (Account account: accounts){
            if (account.getId() == accountId) {
                accounts.remove(account);
                return true;
            }
        }
        return false;
    }
    public String toString(){
        String s = this.id + " " + this.name + " " + this.phone + "\n";

        for (Account account1: accounts){
            s+= account1.toString() + "\n";
        }

        return s;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

public class clientneso {
    public static void main(String[] args){
        client[] client1 = new client[2];
        client1[0] = new client(7, "James", "12345");
        client1[0].addAccount(new Account(1, 1000, 0.075));
        client1[0].addAccount(new Account(2, 2000, 0.085));

        client1[1] = new client(11, "Jones", "67890");
        client1[1].addAccount(new Account(1, 2000, 0.0975));
        client1[1].addAccount(new Account(2, 3000, 0.0875));
        client1[1].addAccount(new Account(3, 4000, 0.0775));

        System.out.println(client1[0].toString());
        System.out.println(client1[1].toString());


    }
}
