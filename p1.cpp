#include <iostream>
#include <sstream>
#include <iomanip>

using namespace std;

void convertToIpv6(string ipv4address) {
    stringstream ss(ipv4address);
    string octet;
    int octets[4];
    int i = 0;

    // Split IPv4 address into octets
    while (getline(ss, octet, '.')) {
        if (i >= 4) {
            cout << "Invalid input" << endl;
            return;
        }
        int value = stoi(octet);
        if (value < 0 || value > 255) {
            cout << "Invalid input" << endl;
            return;
        }
        octets[i++] = value;
    }

    // Check if exactly 4 octets are present
    if (i != 4) {
        cout << "Invalid input" << endl;
        return;
    }

    // Check if the IP is a loopback address
    if (octets[0] == 127) {
        cout << "::1" << endl;
        return;
    }

    // Convert octets to hex and form IPv6 address
    cout << "::FFFF:";
    cout << uppercase << hex << setw(2) << setfill('0') << octets[0];
    cout << setw(2) << setfill('0') << octets[1] << ":";
    cout << setw(2) << setfill('0') << octets[2];
    cout << setw(2) << setfill('0') << octets[3] << endl;
}

int main() {
    string ipv4address;
    cin >> ipv4address;
    convertToIpv6(ipv4address);
    return 0;
}
