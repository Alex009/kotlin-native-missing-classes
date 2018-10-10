//
//  AppDelegate.swift
//  DemoApplication
//
//  Created by Aleksey Mikhailov on 10/10/2018.
//  Copyright © 2018 IceRock Development. All rights reserved.
//

import UIKit
import MultiPlatformLibrary

@UIApplicationMain
class AppDelegate: UIResponder, UIApplicationDelegate {
  func applicationDidFinishLaunching(_ application: UIApplication) {
    let tester = Tester()
    
    let returnedObject = tester.testObjectReturn()
    if let pairObject = returnedObject as? KotlinPair {
      print(pairObject.first)
    }
    
    tester.testException() { error in
      if(error is MPUCustomException) {
        print("custom exception!")
      }
      print(error)
      return KotlinUnit()
    }
  }
}
