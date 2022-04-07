## Get started

### Terminal

1. Install Java 8 (since android-sdk requires Java 8)
    ```bash
    $ brew install --cask  homebrew/cask-versions/adoptopenjdk8
    ```

1. Install Android SDK
    ```bash
    $ brew install --cask android-sdk
    ```

1. Install gradle
    ```bash
    $ brew install gradle
    ```

1. Set environment variables for Java and Android (add into `.bashrc` or `.zshrc` for your convenience)
    ```bash
    $ export JAVA_HOME=`/usr/libexec/java_home -v 1.8`
    $ export ANDROID_SDK_ROOT="/usr/local/share/android-sdk"
    ```

1. Clone the repo
    ```bash
    $ git clone git@github.com:banksalad/banksalad-android.git
    $ cd banksalad-android
    ```