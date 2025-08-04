import base64

cipher = "DFttQMMlgmresTaBFEKOBqAdilLeGcnpGlOihADHgNPkmlIiNtqAenTlitdMmQQgcPkbkqGlPEKQrIpHHLNGlOESENHtpSGGgfsRNGlSSObgiBAPPsqAejBiITpSFCSNqsGlLjIgKLENEhEcfHRrkfdHREmhspqAiPSagiBAbpJOtntAoiHLjnHLjCOQiBAAAAAigPfhBFdsqApLlQRKmNfhmQeGBAAAAAOsISimGlLjI"

try:
    decoded = base64.b64decode(cipher)
    print(decoded.decode())
except Exception as e:
    print("ไม่ใช่ base64 หรือ decode ไม่สำเร็จ:", e)
