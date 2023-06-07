package HW23GroupProgect2;
  /*
    Provide Implementation for the diagram below. Then create a test class in which you need to create
    Objects of ChromeDriver, FirefoxDrive and SafariDriver classes and see which methods available to them.
    */

public abstract class Task10WebDriver {
    abstract void open() ;

    abstract void close();

    String getTitle() {
        return null;
    }
}

interface TakesScreenshot {
    void getScreenshot();
}

abstract class RemoteWebDriver extends Task10WebDriver implements TakesScreenshot {
    public abstract void navigate();

    @Override
    public String getTitle() {
        return null;
    }
}

class ChromeDriver extends RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Open Chrome");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome");
    }

    @Override
    public String getTitle() {
        return "Chrome Title";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Chrome");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Chrome screenshot");
    }
}

class FirefoxDriver extends RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Open Firefox");
    }

    @Override
    public void close() {
        System.out.println("Close Firefox");
    }

    @Override
    public String getTitle() {
        return "Firefox Title";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Firefox screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Firefox");
    }
}

class SafariDriver extends RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Open Safari");
    }

    @Override
    public void close() {
        System.out.println("Close Safari");
    }

    @Override
    public String getTitle() {
        return "Safari Title";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Safari screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Safari");
    }
}

class Tester {
    public static void main(String[] args) {
        ChromeDriver chrome = new ChromeDriver();
        chrome.open();
        chrome.close();
        System.out.println(chrome.getTitle());
        chrome.navigate();
        chrome.getScreenshot();

        System.out.println("...............................");
        FirefoxDriver firefox = new FirefoxDriver();
        firefox.open();
        firefox.close();
        System.out.println(firefox.getTitle());
        firefox.navigate();
        firefox.getScreenshot();

        System.out.println(".................................");
        SafariDriver safari = new SafariDriver();
        safari.open();
        safari.close();
        System.out.println(safari.getTitle());
        safari.navigate();
        safari.getScreenshot();
    }
}
