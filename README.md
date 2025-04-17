# Swift Cause Mobile

![Banner Placeholder](https://github.com/YNVSolutions/SwiftCause-mobile/blob/main/banner.png)

**Mobile Applications for the Modern Donation Platform**

This repository contains the source code for the mobile applications (Android and iOS) of the Swift Cause donation platform. Built using Kotlin Multiplatform, this codebase shares core business logic while providing native user interfaces with Jetpack Compose for Android and SwiftUI for iOS.


## Key Features

* **Shared Business Logic:** Core mobile functionalities (network calls, data models, business rules) are implemented in shared Kotlin code, ensuring consistency across platforms.
* **Native UI:** Platform-specific user interfaces built with Jetpack Compose (Android) and SwiftUI (iOS) for a seamless and native user experience.
* **Mobile-First Payment Integration:** Secure in-app payment processing via Stripe and SumUp SDKs.
* **Phone-Enabled Transactions:** Utilizing device capabilities like camera (for QR code scanning) and NFC for streamlined donations.
* **Flexible Donation Modes:** Support for one-time and recurring donations with optimized mobile checkout flows.
* **"Tap and Donate":** Streamlined donation option for repeat donors.
* **Campaign Browsing:** Users can browse and view details of active fundraising campaigns.
* **Secure Authentication:** User authentication managed via Firebase Authentication.
* **Real-Time Data Synchronization:** Leveraging Firebase Realtime Database or Cloud Firestore for live updates.
* **Push Notifications:** Stay informed about campaign progress and updates via Firebase Cloud Messaging.
* **UK-Specific Features:** Integration with Gift Aid processes (where applicable).

## Tech Stack

![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack_Compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white)
![Swift](https://img.shields.io/badge/Swift-F05138?style=for-the-badge&logo=swift&logoColor=white)
![SwiftUI](https://img.shields.io/badge/SwiftUI-000000?style=for-the-badge&logo=swift&logoColor=white)
![Firebase](https://img.shields.io/badge/Firebase-FFCA28?style=for-the-badge&logo=firebase&logoColor=black)
![Stripe](https://img.shields.io/badge/Stripe-6772E5?style=for-the-badge&logo=stripe&logoColor=white)
![SumUp](https://img.shields.io/badge/SumUp-1AB394?style=for-the-badge&logo=sumup&logoColor=white)

## Getting Started

### Project Clone

To clone the Swift Cause mobile repository, use the following command:

```bash
git clone 
cd swift-cause-mobile