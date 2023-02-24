#!/usr/bin/env groovy
package com.example

def call() {
     return new Docker(this).dockerLogin()   
} 