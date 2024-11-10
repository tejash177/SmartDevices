package Project;

public class Camera {
    private boolean isPhotoTaken = false;

    public void takePhoto() {
        if (!isPhotoTaken) {
            System.out.println("Smile you are on Camera..");
            isPhotoTaken = true;
        } else {
            System.out.println("You already took a photo.");
        }
    }

    public void viewPhotos() {
        if (isPhotoTaken) {
            System.out.println("You look great...");
        } else {
            System.out.println("You don't have any photos yet.");
        }
    }
}
