from utils import listener

class Challenge:
    def __init__(self):
        print("Challenge Initialized")

    def challenge(self, data):
        return {"received": data}

if __name__ == "__main__":
    listener.start_server(port=1337)
