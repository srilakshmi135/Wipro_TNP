package OOPSInheritance.miniprojects.VideoRentalInventorySystem;

public class VideoStore {

    private Video[] store;
    private int count;

    public VideoStore() {
        store = new Video[10];
        count = 0;
    }

    public void addVideo(String name) {

        store[count] = new Video(name);
        count++;

        System.out.println("Video \"" + name + "\" added successfully.");
    }


    public void doCheckout(String name) {

        for(int i=0;i<count;i++) {

            if(store[i].getName().equals(name)) {

                store[i].doCheckout();

                System.out.println(
                    "Video \"" + name + "\" checked out successfully."
                );
            }
        }
    }


    public void doReturn(String name) {

        for(int i=0;i<count;i++) {

            if(store[i].getName().equals(name)) {

                store[i].doReturn();

                System.out.println(
                    "Video \"" + name + "\" returned successfully."
                );
            }
        }
    }


    public void receiveRating(String name,int rating) {

        for(int i=0;i<count;i++) {

            if(store[i].getName().equals(name)) {

                store[i].receiveRating(rating);

                System.out.println(
                    "Rating \""+rating+
                    "\" has been mapped to the Video \""+name+"\"."
                );
            }
        }
    }


    public void listInventory() {

        System.out.println("-----------------------------------------");
        System.out.println("Video Name | Checkout Status | Rating");

        for(int i=0;i<count;i++) {

            System.out.println(
                store[i].getName()+" | "+
                store[i].getCheckout()+" | "+
                store[i].getRating()
            );
        }

        System.out.println("-----------------------------------------");
    }
}