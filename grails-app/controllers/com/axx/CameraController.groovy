package com.axx

import grails.plugin.springsecurity.annotation.Secured


@Secured('ROLE_ADMIN')
class CameraController {

    def index() {
        [items: Camera.list()]
    }
}
