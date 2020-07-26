/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */


// 200 X 200 - 400 X 400 -> 200 X 200 -- 1:1
// 200 X 200 - 400 X 200 -> 200 X 100 -- 2:1
// 200 X 200 - 200 X 400 -> 100 X 200 -- 1:2

class ImageResolutionWithAR {
    public static void main(String[] args) {

        ImageResolutionWithAR.setImageInView(200, 200, 200, 200);
        ImageResolutionWithAR.setImageInView(200, 200, 400, 200);
       ImageResolutionWithAR.setImageInView(200, 200, 200, 400);

        ImageResolutionWithAR.setImageInView(400, 200, 100, 200);
        ImageResolutionWithAR.setImageInView(400, 200, 200, 400);
        ImageResolutionWithAR.setImageInView(40, 200, 60, 80);
    }

    /* */

    public static void setImageInView(int ch, int cw, int ih, int iw) {

        if (ch == ih && cw == iw) {
            System.out.println("Height and Width of Image0 " + ih + " " + " " + iw);
            return;
        }

        int newHeight = ih;
        int newWidth = iw;

        if (iw > cw) {
            newWidth = newWidth / (iw / cw);
            newHeight = newHeight / (iw / cw);
        } else if (cw > iw) {
            newWidth = newWidth / (cw / iw);
            newHeight = newHeight / (cw / iw);
        }

        if (newHeight > ch) {
            if (ih > ch) {
                newHeight = newHeight / (ih / ch);
                newWidth = iw / (ih / ch);
            } else {
                newHeight = ih / (ch / ih);
                newWidth = iw / (ch / ih);
            }
        }
        System.out.println("Height and Width of Image 5 " + newHeight + " " + " " + newWidth);
    }
}