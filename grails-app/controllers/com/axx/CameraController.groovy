package com.axx

class CameraController {

    def index() {
        [items: Camera.list()]
    }
}
