package com.jos.dem.vetlog.service

interface RegistrationService {
  String findEmailByToken(String token)
  void generateRegistrationCodeForEmail(String email)
}
