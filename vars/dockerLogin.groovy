#!/usr/bin/env groovy
package com.app

def call() {
     return new Docker(this).dockerLogin()   
} 